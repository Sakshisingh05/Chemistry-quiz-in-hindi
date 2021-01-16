package com.example.chemistryquizapp;

public class QuestionCh3 {
    private String mQuestions [] = {
            "कौन-सा अधातु कमरे के ताप पर द्रव होता है ?",
            "इस्पात में कितना प्रतिशत कार्बन है ?",
            "ताम्र एवं टीन के मिश्रधातु को क्या कहते हैं ?",
            "बारूद होता है ?",
            "इनमें से कौन-सी धातु द्रव अवस्था में पायी जाती है ?",
            "किसी उदासीन विलयन का pH मान है ?",
            "” विश्व का प्रत्येक पदार्थ अत्यन्त सूक्ष्म कणों से मिलकर बना होता है “, यह सर्वप्रथम किसने कहा ?",
            "सोडियम, लीथियम, कैल्सियम और निकेल में से किस धातु को चाकू से काटा जा सकता है ?",
            "कौन-सा धातु जल में डालने पर तैरने लगता है ?",
            "निम्नलिखित में से रासायनिक यौगिक कौन-सा है ?",
            "मैग्नीशियम के दहन से जो उत्पादक बनते हैं वह –",
            "अति मुलायम खनिज  Mineral टाल्क  (सोप स्टोन) मुख्यतः है:-",
            "प्लास्टर आफ पेरिस का रासायनिक सूत्र है ?",
            "निम्नलिखित में से सबसे भारी the heaviest धातु है ?",
            "सामान्य किस्म Variety का कोयला है:-",
            ""

    };


    private String mChoices [][] = {
            {"पारा", "ऐलुमिनियम", "ब्रोमीन"},
            {"3 %", "4 %", "2 %"},
            {"पीतल", "डयूरालुमिन", "काँसा"},
            {"यौगिक", "मिश्रण", "द्रव"},
            {"लोहा", "मरकरी", "चाँदी"},
            {"7 है", "2 है", "9 है"},
            {"रदरफोर्ड", "डाल्टन", "कणाद"},
            {"सोडियम", "लीथियम", "कैल्सियम"},
            {"कैल्सियम", "निकेल", "मैग्नीशियम"},
            {"अमोनिया", "वायु", "पारा"},
            {"अम्लीय है", "उदासीन है", "क्षारीय है"},
            {"मैंगनीज  Manganese सिलिकेट", "सोडियम Sodium सिलिकेट", "सोडियम Sodium फास्फेट"},
            {"CaSO4.5H2O", "2CaSO4.H2O", "(CkSO4)2.2H2p"},
            {"तांबा", "यूरेनियम", "एल्यूमिनियम"},
            {"एन्थ्रासाईट", "लिग्नाइट", "बिटुमिनस"},
            {"", "", ""}
    };



    private String mCorrectAnswers[] = {
            "ब्रोमीन",
            "2 %",
            "काँसा",
            "मिश्रण",
            "मरकरी",
            "7 है",
            "कणाद",
            "सोडियम",
            "कैल्सियम",
            "अमोनिया",
            "क्षारीय है",
            "मैंगनीज  Manganese सिलिकेट",
            "2CaSO4.H2O",
            "यूरेनियम",
            "बिटुमिनस",
            ""

    };




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public int getLength(){
        return mQuestions.length;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}

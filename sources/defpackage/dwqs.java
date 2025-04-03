package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dwqs implements eyge {
    GDD_UNKNOWN(0),
    GDD_NEVER_USE_THIS_SEE_OMG_28475(1),
    GDD_WEBREF(2),
    GDD_WEBREF_NGA(7),
    GDD_NGA_GENIE_FM(3),
    GDD_APA_GENIE_FM(4),
    GDD_APA_BISTO(5),
    GDD_APA_WARMACTIONS(6),
    GDD_APA_LIGHTWEIGHT_TOKENS(9),
    GDD_MDD_SAMPLE_APP_MULTI_VARIANTS(10),
    GDD_APA_HOTWORD_MODEL(11),
    GDD_APA_UCM_TFL(12),
    GDD_APA_DICTATION_FORMATTING(13),
    GDD_APA_CORRECTIONS(14),
    GDD_APA_HEAD_SUGGEST(15),
    GDD_APA_SMART_ACTION_MODELS(16),
    GDD_APA_BISTO_DEVICE_CUSTOMIZE_INFO(17),
    GDD_LENS_TEXT(18),
    GDD_APA_ARC_POP_NLU_MODELS(19),
    GDD_MOBSERVE_CODELAB(20),
    GDD_APA_HOTMATCH(21),
    GDD_AGSA_GROWTH_TRACKING(22),
    GDD_APA_POP(1022),
    GDD_LENS_AVS(23),
    GDD_ANDROID_AUTOFILL_VCN_MERCHANT_OPT_OUT(25),
    GDD_AAE_SMART_ACTION_MODELS(26),
    GDD_ANDROID_AUTOFILL_FIELD_PREDICTIONS(27),
    GDD_APA_RIOD(28),
    GDD_LENS_OFFLINE_TEXT(29),
    GDD_LENS_INPAINTING(30),
    GDD_WELLBEING_INTELLIGENCE(31),
    GDD_SCONE_UE_CAPA_DOWNLOADER(32),
    GDD_ODLH_FA_REGIONS(33),
    GDD_AIP_TOAST_QUALITY(34),
    GDD_BUGLE_DATA_DOWNLOAD(35),
    GDD_GOOGLE_PLAY_BOOKS_ANDROID_READING_PRACTICE_SOUND_OUT(36),
    GDD_BUGLE_EMOJIFY(37),
    GDD_ASSISTANT_AUTO_EMBEDDED_POP(39),
    GDD_AGSA_APA_TEST_GROUP(40),
    GDD_BUGLE_SUMMARIZATION(41),
    GDD_AGSA_APA_SUMMARIZE(42),
    GDD_LENS_SCENE_X(43),
    GDD_AGSA_APA_CONTACT(44),
    GDD_FILES_OCR_ML_MODEL(45),
    GDD_WALLET_ISSUER_LOCATION(46),
    GDD_AGSA_APA_ROADWAY_RECAP_MODELS(47),
    GDD_BUGLE_SMARTS(48),
    GDD_LENS_TEXT_CLASSIFIER(49),
    GDD_APA_TELEPORT(50),
    GDD_AGSA_APA_TEXT_CLASSIFIER(51),
    GDD_AGSA_APA_TCLIB_PERSON_NAME(52),
    GDD_PIXELMERLIN_MODELS(53),
    GDD_LENS_SEGMENTATION(54),
    GDD_LENS_EDU(55),
    GDD_LENS_RAID(56),
    GDD_SPEECH_DSP_HOTWORD_MODEL(57),
    GDD_CAMERA_FEATURE_COMBINATION_QUERY_GDD(58),
    GDD_CUSTOMIZATIONBUNDLE_THEMEPACK(59),
    GDD_TR_TRANSLITERATION(60),
    GDD_TR_NMT(61),
    GDD_TR_DICTIONARY(62),
    GDD_CAST_DEVICECONFIGS(63),
    GDD_PIXELCARE_AGENT_RESOURCES(64),
    GDD_SBG_SPEECH_MODEL_DOWNLOAD(65),
    GDD_AGSA_UNIFIED_MIC(66);

    private final int ao;

    dwqs(int i) {
        this.ao = i;
    }

    public static dwqs b(int i) {
        if (i == 1022) {
            return GDD_APA_POP;
        }
        switch (i) {
            case 0:
                return GDD_UNKNOWN;
            case 1:
                return GDD_NEVER_USE_THIS_SEE_OMG_28475;
            case 2:
                return GDD_WEBREF;
            case 3:
                return GDD_NGA_GENIE_FM;
            case 4:
                return GDD_APA_GENIE_FM;
            case 5:
                return GDD_APA_BISTO;
            case 6:
                return GDD_APA_WARMACTIONS;
            case 7:
                return GDD_WEBREF_NGA;
            default:
                switch (i) {
                    case 9:
                        return GDD_APA_LIGHTWEIGHT_TOKENS;
                    case 10:
                        return GDD_MDD_SAMPLE_APP_MULTI_VARIANTS;
                    case 11:
                        return GDD_APA_HOTWORD_MODEL;
                    case 12:
                        return GDD_APA_UCM_TFL;
                    case 13:
                        return GDD_APA_DICTATION_FORMATTING;
                    case 14:
                        return GDD_APA_CORRECTIONS;
                    case 15:
                        return GDD_APA_HEAD_SUGGEST;
                    case 16:
                        return GDD_APA_SMART_ACTION_MODELS;
                    case 17:
                        return GDD_APA_BISTO_DEVICE_CUSTOMIZE_INFO;
                    case 18:
                        return GDD_LENS_TEXT;
                    case 19:
                        return GDD_APA_ARC_POP_NLU_MODELS;
                    case 20:
                        return GDD_MOBSERVE_CODELAB;
                    case 21:
                        return GDD_APA_HOTMATCH;
                    case 22:
                        return GDD_AGSA_GROWTH_TRACKING;
                    case 23:
                        return GDD_LENS_AVS;
                    default:
                        switch (i) {
                            case 25:
                                return GDD_ANDROID_AUTOFILL_VCN_MERCHANT_OPT_OUT;
                            case 26:
                                return GDD_AAE_SMART_ACTION_MODELS;
                            case 27:
                                return GDD_ANDROID_AUTOFILL_FIELD_PREDICTIONS;
                            case 28:
                                return GDD_APA_RIOD;
                            case 29:
                                return GDD_LENS_OFFLINE_TEXT;
                            case 30:
                                return GDD_LENS_INPAINTING;
                            case 31:
                                return GDD_WELLBEING_INTELLIGENCE;
                            case 32:
                                return GDD_SCONE_UE_CAPA_DOWNLOADER;
                            case 33:
                                return GDD_ODLH_FA_REGIONS;
                            case 34:
                                return GDD_AIP_TOAST_QUALITY;
                            case 35:
                                return GDD_BUGLE_DATA_DOWNLOAD;
                            case 36:
                                return GDD_GOOGLE_PLAY_BOOKS_ANDROID_READING_PRACTICE_SOUND_OUT;
                            case 37:
                                return GDD_BUGLE_EMOJIFY;
                            default:
                                switch (i) {
                                    case Maneuver.TYPE_DESTINATION /* 39 */:
                                        return GDD_ASSISTANT_AUTO_EMBEDDED_POP;
                                    case 40:
                                        return GDD_AGSA_APA_TEST_GROUP;
                                    case 41:
                                        return GDD_BUGLE_SUMMARIZATION;
                                    case 42:
                                        return GDD_AGSA_APA_SUMMARIZE;
                                    case 43:
                                        return GDD_LENS_SCENE_X;
                                    case 44:
                                        return GDD_AGSA_APA_CONTACT;
                                    case 45:
                                        return GDD_FILES_OCR_ML_MODEL;
                                    case 46:
                                        return GDD_WALLET_ISSUER_LOCATION;
                                    case 47:
                                        return GDD_AGSA_APA_ROADWAY_RECAP_MODELS;
                                    case 48:
                                        return GDD_BUGLE_SMARTS;
                                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                        return GDD_LENS_TEXT_CLASSIFIER;
                                    case 50:
                                        return GDD_APA_TELEPORT;
                                    case 51:
                                        return GDD_AGSA_APA_TEXT_CLASSIFIER;
                                    case 52:
                                        return GDD_AGSA_APA_TCLIB_PERSON_NAME;
                                    case 53:
                                        return GDD_PIXELMERLIN_MODELS;
                                    case 54:
                                        return GDD_LENS_SEGMENTATION;
                                    case 55:
                                        return GDD_LENS_EDU;
                                    case 56:
                                        return GDD_LENS_RAID;
                                    case 57:
                                        return GDD_SPEECH_DSP_HOTWORD_MODEL;
                                    case 58:
                                        return GDD_CAMERA_FEATURE_COMBINATION_QUERY_GDD;
                                    case 59:
                                        return GDD_CUSTOMIZATIONBUNDLE_THEMEPACK;
                                    case 60:
                                        return GDD_TR_TRANSLITERATION;
                                    case 61:
                                        return GDD_TR_NMT;
                                    case 62:
                                        return GDD_TR_DICTIONARY;
                                    case 63:
                                        return GDD_CAST_DEVICECONFIGS;
                                    case 64:
                                        return GDD_PIXELCARE_AGENT_RESOURCES;
                                    case 65:
                                        return GDD_SBG_SPEECH_MODEL_DOWNLOAD;
                                    case 66:
                                        return GDD_AGSA_UNIFIED_MIC;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.ao;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ao);
    }
}

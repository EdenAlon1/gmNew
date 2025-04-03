package com.google.android.libraries.geller.portable.database;

import defpackage.enip;
import defpackage.enpx;
import defpackage.eyns;
import defpackage.eyoq;
import defpackage.ezib;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface GellerDatabase {
    public static final enip a = new enpx(ezib.HERON.name());
    public static final enip b = enip.v(ezib.GDD_AAE_SMART_ACTION_MODELS.name(), ezib.GDD_AGSA_APA_CONTACT.name(), ezib.GDD_AGSA_APA_ROADWAY_RECAP_MODELS.name(), ezib.GDD_AGSA_APA_SUMMARIZE.name(), ezib.GDD_AGSA_APA_TCLIB_PERSON_NAME.name(), ezib.GDD_AGSA_APA_TEST_GROUP.name(), ezib.GDD_AGSA_APA_TEXT_CLASSIFIER.name(), ezib.GDD_AGSA_GROWTH_TRACKING.name(), ezib.GDD_AGSA_UNIFIED_MIC.name(), ezib.GDD_AIP_TOAST_QUALITY.name(), ezib.GDD_ANDROID_AUTOFILL_FIELD_PREDICTIONS.name(), ezib.GDD_ANDROID_AUTOFILL_VCN_MERCHANT_OPT_OUT.name(), ezib.GDD_APA_ARC_POP_NLU_MODELS.name(), ezib.GDD_APA_BISTO.name(), ezib.GDD_APA_BISTO_DEVICE_CUSTOMIZE_INFO.name(), ezib.GDD_APA_CORRECTIONS.name(), ezib.GDD_APA_DICTATION_FORMATTING.name(), ezib.GDD_APA_GENIE_FM.name(), ezib.GDD_APA_HEAD_SUGGEST.name(), ezib.GDD_APA_HOTMATCH.name(), ezib.GDD_APA_HOTWORD_MODEL.name(), ezib.GDD_APA_LIGHTWEIGHT_TOKENS.name(), ezib.GDD_APA_POP.name(), ezib.GDD_APA_RIOD.name(), ezib.GDD_APA_SMART_ACTION_MODELS.name(), ezib.GDD_APA_TELEPORT.name(), ezib.GDD_APA_UCM_TFL.name(), ezib.GDD_APA_WARMACTIONS.name(), ezib.GDD_ASSISTANT_AUTO_EMBEDDED_POP.name(), ezib.GDD_BUGLE_DATA_DOWNLOAD.name(), ezib.GDD_BUGLE_EMOJIFY.name(), ezib.GDD_BUGLE_SMARTS.name(), ezib.GDD_BUGLE_SUMMARIZATION.name(), ezib.GDD_CAMERA_FEATURE_COMBINATION_QUERY_GDD.name(), ezib.GDD_CAST_DEVICECONFIGS.name(), ezib.GDD_CUSTOMIZATIONBUNDLE_THEMEPACK.name(), ezib.GDD_FILES_OCR_ML_MODEL.name(), ezib.GDD_GOOGLE_PLAY_BOOKS_ANDROID_READING_PRACTICE_SOUND_OUT.name(), ezib.GDD_LENS_AVS.name(), ezib.GDD_LENS_EDU.name(), ezib.GDD_LENS_INPAINTING.name(), ezib.GDD_LENS_OFFLINE_TEXT.name(), ezib.GDD_LENS_RAID.name(), ezib.GDD_LENS_SCENE_X.name(), ezib.GDD_LENS_SEGMENTATION.name(), ezib.GDD_LENS_TEXT.name(), ezib.GDD_LENS_TEXT_CLASSIFIER.name(), ezib.GDD_NGA_GENIE_FM.name(), ezib.GDD_ODLH_FA_REGIONS.name(), ezib.GDD_PIXELCARE_AGENT_RESOURCES.name(), ezib.GDD_PIXELMERLIN_MODELS.name(), ezib.GDD_SBG_SPEECH_MODEL_DOWNLOAD.name(), ezib.GDD_SCONE_UE_CAPA_DOWNLOADER.name(), ezib.GDD_SPEECH_DSP_HOTWORD_MODEL.name(), ezib.GDD_TR_DICTIONARY.name(), ezib.GDD_TR_NMT.name(), ezib.GDD_TR_TRANSLITERATION.name(), ezib.GDD_WALLET_ISSUER_LOCATION.name(), ezib.GDD_WEBREF.name(), ezib.GDD_WEBREF_NGA.name(), ezib.GDD_WELLBEING_INTELLIGENCE.name());

    long a(String str, eyoq eyoqVar);

    Map b();

    void c();

    long delete(String str);

    long delete(String str, byte[] bArr);

    long deleteMetadata(String str, String str2);

    byte[] getCorpusStats();

    byte[] getCorpusStats(String[] strArr);

    byte[] getSnapshot(String[] strArr, int i, boolean z);

    long markSyncStatus(String str, byte[] bArr);

    byte[][] read(String str, boolean z, boolean z2);

    byte[][] read(String str, byte[] bArr);

    byte[][] readAll(String str);

    String[] readDatabaseInfo(String str);

    String[] readKeys(String str);

    String[] readMetadata(String str, String str2);

    byte[] readMetadataForAllCorpora(String str);

    byte[][] readOutdatedData(String str);

    long setDeletionProcessed(byte[] bArr);

    long softDelete(String str, eyns eynsVar);

    long softDelete(String str, byte[] bArr);

    boolean write(String str, String[] strArr, long j, boolean z, byte[] bArr);

    byte[] write(byte[] bArr);

    boolean writeMetadata(String str, String str2, String str3);

    byte[] writeWithResult(String str, String[] strArr, long j, boolean z, byte[] bArr);
}

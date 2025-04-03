package com.google.android.libraries.geller.portable.callbacks;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface GellerLoggingCallback {
    void logCorpusQuotaExceeded(String str);

    void logGellerCacheCleanup(String str, long j);

    void logGellerCacheCorpusCleanup(String str, long j);

    void logGellerCacheDelete(String str, boolean z, long j);

    void logGellerCacheDeleteResult(String str, boolean z, long j);

    void logGellerCacheDeletionPropagationElementsCount(String str, boolean z, long j);

    void logGellerCacheGetCorpusStats(String str, boolean z, long j);

    void logGellerCacheGetCorpusStatsResult(String str, boolean z, long j);

    void logGellerCacheRead(String str, boolean z, long j);

    void logGellerCacheReadMetadata(String str, boolean z, long j);

    void logGellerCacheReadMetadataResult(String str, boolean z, long j);

    void logGellerCacheReadResult(String str, boolean z, long j);

    void logGellerCacheSyncUpdate(String str, boolean z, long j);

    void logGellerCacheSyncUpdateDeletionDownloadResult(String str, boolean z, long j);

    void logGellerCacheSyncUpdateDownloadResult(String str, boolean z, long j);

    void logGellerCacheWrite(String str, boolean z, long j);

    void logGellerCacheWriteResult(String str, boolean z, long j);

    void logGellerConsentCheckActivityControlsComparison(String str, String str2, boolean z, boolean z2);

    void logGellerConsentMiniWaaComparison(String str, String str2, boolean z);

    void logNumberOfElementsDeletedBySyncTimeRangeDeletion(String str, int i);

    void logSizeOfElementsDeletedBySyncTimeRangeDeletion(String str, int i);
}

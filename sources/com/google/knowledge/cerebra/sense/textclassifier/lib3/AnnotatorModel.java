package com.google.knowledge.cerebra.sense.textclassifier.lib3;

import android.content.res.AssetFileDescriptor;
import defpackage.ewvk;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AnnotatorModel implements AutoCloseable {
    public long a;
    public LangIdModel b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    /* compiled from: PG */
    public static final class AnnotatedSpan {
        public final int a;
        public final int b;
        public final ClassificationResult[] c;

        AnnotatedSpan(int i, int i2, ClassificationResult[] classificationResultArr) {
            this.a = i;
            this.b = i2;
            this.c = classificationResultArr;
        }
    }

    /* compiled from: PG */
    public static final class AnnotationOptions {
        private final long a;
        private final String b;
        private final String c;
        private final String d;
        private final String[] e;
        private final int f;

        public AnnotationOptions(long j, String str, String str2, String str3, Collection collection, int i) {
            this.a = j;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = collection == null ? new String[0] : (String[]) collection.toArray(new String[collection.size()]);
            this.f = i;
        }

        public int getAnnotateMode() {
            return 0;
        }

        public int getAnnotationUsecase() {
            return this.f;
        }

        public String getDetectedTextLanguageTags() {
            return this.d;
        }

        public String[] getEntityTypes() {
            return this.e;
        }

        public String getLocale() {
            return this.c;
        }

        public long getReferenceTimeMsUtc() {
            return this.a;
        }

        public String getReferenceTimezone() {
            return this.b;
        }

        public boolean getTriggerDictionaryOnBeginnerWords() {
            return false;
        }

        public boolean getUsePodNer() {
            return true;
        }

        public boolean getUseVocabAnnotator() {
            return true;
        }

        public float getUserLocationAccuracyMeters() {
            return 0.0f;
        }

        public double getUserLocationLat() {
            return 180.0d;
        }

        public double getUserLocationLng() {
            return 360.0d;
        }

        public boolean hasLocationPermission() {
            return true;
        }

        public boolean hasPersonalizationPermission() {
            return true;
        }

        public boolean isSerializedEntityDataEnabled() {
            return true;
        }
    }

    /* compiled from: PG */
    public static final class Annotations {
        Annotations(AnnotatedSpan[][] annotatedSpanArr, ClassificationResult[] classificationResultArr) {
        }
    }

    /* compiled from: PG */
    public static final class ClassificationOptions {
        private final long a;
        private final String b;
        private final String c;
        private final String d;
        private final int e;
        private final String f;

        public ClassificationOptions(long j, String str, String str2, String str3, int i, String str4) {
            this.a = j;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = i;
            this.f = str4;
        }

        public int getAnnotationUsecase() {
            return this.e;
        }

        public String getDetectedTextLanguageTags() {
            return this.d;
        }

        public boolean getEnableAddContactIntent() {
            return false;
        }

        public boolean getEnableSearchIntent() {
            return false;
        }

        public String getLocale() {
            return this.c;
        }

        public long getReferenceTimeMsUtc() {
            return this.a;
        }

        public String getReferenceTimezone() {
            return this.b;
        }

        public boolean getReturnEmptyClassificationResultForFailure() {
            return true;
        }

        public boolean getTriggerDictionaryOnBeginnerWords() {
            return false;
        }

        public boolean getUsePodNer() {
            return true;
        }

        public boolean getUseVocabAnnotator() {
            return true;
        }

        public String getUserFamiliarLanguageTags() {
            return this.f;
        }

        public float getUserLocationAccuracyMeters() {
            return 0.0f;
        }

        public double getUserLocationLat() {
            return 180.0d;
        }

        public double getUserLocationLng() {
            return 360.0d;
        }
    }

    /* compiled from: PG */
    public static final class ClassificationResult {
        public final String a;
        public final float b;
        public final DatetimeResult c;
        public final byte[] d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final String n;
        public final String o;
        public final byte[] p;
        public final RemoteActionTemplate[] q;
        public final long r;
        public final long s;
        public final double t;

        public ClassificationResult(String str, float f, DatetimeResult datetimeResult, byte[] bArr, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, NamedVariant[] namedVariantArr, byte[] bArr2, RemoteActionTemplate[] remoteActionTemplateArr, long j, long j2, double d) {
            this.a = str;
            this.b = f;
            this.c = datetimeResult;
            this.d = bArr;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
            this.i = str6;
            this.j = str7;
            this.k = str8;
            this.l = str9;
            this.m = str10;
            this.n = str11;
            this.o = str12;
            this.p = bArr2;
            this.q = remoteActionTemplateArr;
            this.r = j;
            this.s = j2;
            this.t = d;
        }
    }

    /* compiled from: PG */
    public static final class DatetimeResult {
        public final long a;
        public final int b;

        public DatetimeResult(long j, int i) {
            this.a = j;
            this.b = i;
        }
    }

    /* compiled from: PG */
    public static final class InputFragment {
        public float getBoundingBoxHeight() {
            throw null;
        }

        public float getBoundingBoxTop() {
            throw null;
        }

        public long getReferenceTimeMsUtc() {
            throw null;
        }

        public String getReferenceTimezone() {
            throw null;
        }

        public String getText() {
            throw null;
        }

        public boolean hasDatetimeOptions() {
            throw null;
        }
    }

    /* compiled from: PG */
    public static final class SelectionOptions {
        public int getAnnotationUsecase() {
            throw null;
        }

        public String getDetectedTextLanguageTags() {
            throw null;
        }

        public String getLocales() {
            throw null;
        }

        public boolean getUsePodNer() {
            throw null;
        }

        public boolean getUseVocabAnnotator() {
            throw null;
        }

        public float getUserLocationAccuracyMeters() {
            throw null;
        }

        public double getUserLocationLat() {
            throw null;
        }

        public double getUserLocationLng() {
            throw null;
        }
    }

    static {
        ewvk.a();
    }

    public AnnotatorModel(AssetFileDescriptor assetFileDescriptor) {
        long nativeNewAnnotatorWithOffset = nativeNewAnnotatorWithOffset(assetFileDescriptor.getParcelFileDescriptor().getFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        this.a = nativeNewAnnotatorWithOffset;
        if (nativeNewAnnotatorWithOffset == 0) {
            throw new IllegalArgumentException("Couldn't initialize TC from asset file descriptor.");
        }
    }

    private native void nativeCloseAnnotator(long j);

    public static native String nativeGetLocalesWithOffset(int i, long j, long j2);

    private native long nativeGetNativeModelPtr(long j);

    public static native int nativeGetVersionWithOffset(int i, long j, long j2);

    private static native long nativeNewAnnotatorWithOffset(int i, long j, long j2);

    public final long a() {
        return nativeGetNativeModelPtr(this.a);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.c.compareAndSet(false, true)) {
            nativeCloseAnnotator(this.a);
            this.a = 0L;
        }
    }

    protected final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public native AnnotatedSpan[] nativeAnnotate(long j, String str, AnnotationOptions annotationOptions);

    public native ClassificationResult[] nativeClassifyText(long j, String str, int i, int i2, ClassificationOptions classificationOptions, Object obj, String str2);

    public native boolean nativeInitializeContactEngine(long j, byte[] bArr);

    public native boolean nativeInitializeKnowledgeEngine(long j, byte[] bArr);

    public native boolean nativeInitializePersonNameEngine(long j, int i, long j2, long j3);

    public native void nativeSetLangId(long j, long j2);
}

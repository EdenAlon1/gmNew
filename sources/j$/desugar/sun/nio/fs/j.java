package j$.desugar.sun.nio.fs;

import j$.nio.file.EnumC0003a;

/* loaded from: classes9.dex */
abstract /* synthetic */ class j {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnumC0003a.values().length];
        a = iArr;
        try {
            iArr[EnumC0003a.READ.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[EnumC0003a.WRITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[EnumC0003a.EXECUTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djkm {
    public static final int[] a = {17, 1, 0};
    public static final int[] b = {1, 0, 17};

    public static Optional a(int i) {
        return i < 0 ? Optional.empty() : Optional.of(Integer.valueOf(i));
    }
}

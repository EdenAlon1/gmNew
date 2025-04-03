package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kho extends khj implements Iterable {
    public kho(char[] cArr) {
        super(cArr);
    }

    @Override // defpackage.khj, defpackage.khk
    /* renamed from: A, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final kho g() {
        return (kho) super.clone();
    }

    @Override // java.lang.Iterable
    public final Iterator<khl> iterator() {
        return new khn(this);
    }
}

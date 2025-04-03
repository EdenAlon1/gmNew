package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eydw extends eydx {
    final /* synthetic */ eyee a;
    private int b = 0;
    private final int c;

    public eydw(eyee eyeeVar) {
        this.a = eyeeVar;
        this.c = eyeeVar.d();
    }

    @Override // defpackage.eydz
    public final byte a() {
        int i = this.b;
        if (i >= this.c) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        return this.a.b(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }
}

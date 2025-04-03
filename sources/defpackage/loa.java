package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class loa extends lnx {
    public loa() {
        this((byte[]) null);
    }

    @Override // defpackage.lnx
    public final Object a(lnw lnwVar) {
        return this.b.get(lnwVar);
    }

    public final void b(lnw lnwVar, Object obj) {
        this.b.put(lnwVar, obj);
    }

    public loa(lnx lnxVar) {
        lnxVar.getClass();
        this.b.putAll(lnxVar.b);
    }

    public /* synthetic */ loa(byte[] bArr) {
        this(lnv.a);
    }
}

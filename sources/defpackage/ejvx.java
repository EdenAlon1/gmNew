package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ejvx extends ejuj {
    public static ejvx a(enip enipVar) {
        emxf.b(enipVar.size() > 1, "A set key must have at least two members.");
        return new ejtx(enipVar);
    }

    @Override // defpackage.ejuj
    public abstract enip b();
}

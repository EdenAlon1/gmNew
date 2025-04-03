package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edrp implements edkr {
    public static edro e(edps edpsVar) {
        edqo edqoVar = new edqo();
        if (edpsVar == null) {
            throw new NullPointerException("Null photoMetadata");
        }
        edqoVar.c = edpsVar;
        return edqoVar;
    }

    @Override // defpackage.edkr
    public abstract dhqd a();

    public abstract edps b();

    public abstract Integer c();

    public abstract Integer d();
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avlh extends avlo {
    public avlh(dvvu dvvuVar) {
        super("Jibe ContactsService failed.");
        emxf.m(!dvvuVar.succeeded(), "Should not create exception with a successful result.");
    }

    public avlh(String str, Throwable th) {
        super(str, th);
    }
}

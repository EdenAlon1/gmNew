package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class roy {
    public final fhoj a;
    public final fhoj b;
    public final fhoj c;
    public final fhol d;

    public roy() {
        fhoj fhojVar = new fhoj("h", "help", false, "Print this help");
        this.a = fhojVar;
        fhoj fhojVar2 = new fhoj("l", "list", false, "List available plugins");
        this.b = fhojVar2;
        fhoj fhojVar3 = new fhoj("p", "process", true, "Specify target process");
        this.c = fhojVar3;
        fhol fholVar = new fhol();
        this.d = fholVar;
        fholVar.d(fhojVar);
        fholVar.d(fhojVar2);
        fholVar.d(fhojVar3);
    }
}

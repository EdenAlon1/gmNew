package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aduz {
    private final entd a = entd.c("Bugle");

    public abstract adva a();

    public abstract void b(adyb adybVar);

    public abstract void c(int i);

    public abstract void d(int i);

    public final adva e() {
        adva a = a();
        aduu aduuVar = (aduu) a;
        if (aduuVar.a > 0 && aduuVar.b > 0) {
            return a;
        }
        adut adutVar = new adut();
        adutVar.b(aduuVar.c);
        adutVar.d(aduuVar.b);
        adutVar.c(aduuVar.a);
        if (aduuVar.b <= 0) {
            int intValue = ((Integer) adva.e.e()).intValue();
            adutVar.d(intValue);
            ((ensz) ((ensz) this.a.j()).h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/dataservices/ProblematicConversationDataRequest$Builder", "build", 73, "ProblematicConversationDataRequest.java")).r("maxMessageCount is non-positive, default value [%d] is used instead", intValue);
        }
        if (aduuVar.a <= 0) {
            int intValue2 = ((Integer) adva.d.e()).intValue();
            adutVar.c(intValue2);
            ((ensz) ((ensz) this.a.j()).h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/dataservices/ProblematicConversationDataRequest$Builder", "build", 79, "ProblematicConversationDataRequest.java")).r("maxConversationCount is non-positive, default value [%d] is used instead", intValue2);
        }
        return adutVar.e();
    }
}

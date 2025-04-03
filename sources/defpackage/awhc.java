package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awhc {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/groups/UpdateGroupChatHandler");
    public final long b;
    public final ffsk c;
    public final avkj d;
    public final awgz e;

    public awhc(long j, ffsk ffskVar, avkj avkjVar) {
        ffskVar.getClass();
        avkjVar.getClass();
        this.b = j;
        this.c = ffskVar;
        this.d = avkjVar;
        this.e = new awgz();
    }

    public final boolean a(String str, awud awudVar) {
        ffrf ffrfVar = (ffrf) this.e.remove(str);
        if (ffrfVar == null) {
            return false;
        }
        ffrfVar.w(awudVar);
        return true;
    }
}

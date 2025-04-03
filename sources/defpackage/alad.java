package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alad extends alae {
    final /* synthetic */ alaf a;
    private final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alad(alaf alafVar, int i, String str, long j) {
        super(alafVar, "Bugle.DataModel.Action.UpdateConversationEncryptionStatusAction.ExecuteAction.DownloadAndProcessRemoteInstanceData.Latency", str, j);
        this.a = alafVar;
        this.d = i;
    }

    @Override // defpackage.alae
    protected final void e(long j) {
        ((akzt) this.a.d.b()).f(this.b, this.d, j);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ods extends ffkk implements ffix {
    final /* synthetic */ ffsd a;
    final /* synthetic */ odt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ods(ffsd ffsdVar, odt odtVar) {
        super(0);
        this.a = ffsdVar;
        this.b = odtVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        aeij.a.p("Creating a new instance of ConversationListDataSource.");
        aeij aeijVar = (aeij) this.b;
        aeijVar.o = new aeig(aeijVar);
        return new ofp(this.a, aeijVar.o);
    }
}

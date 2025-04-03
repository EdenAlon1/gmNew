package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zln extends ffkh implements ffji {
    public zln(Object obj) {
        super(1, obj, zmw.class, "onMostRecentMessageDisplayedOrChanged", "onMostRecentMessageDisplayedOrChanged(Lcom/google/android/libraries/communications/ux/components/message/MessageUiData;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        dnmw dnmwVar = (dnmw) obj;
        dnmwVar.getClass();
        zmw zmwVar = (zmw) this.g;
        abaj abajVar = zmwVar.W;
        efbd.c();
        if (dnmwVar instanceof zsn) {
            abajVar.b.J(((zsn) dnmwVar).c, 1);
        }
        enqu listIterator = ((enpx) zmwVar.p).listIterator();
        while (listIterator.hasNext()) {
            ((zkv) listIterator.next()).a(dnmwVar);
        }
        return ffcu.a;
    }
}

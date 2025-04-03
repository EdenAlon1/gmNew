package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvjw implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        eyal eyalVar = (eyal) obj;
        evxv evxvVar = (evxv) evxw.a.createBuilder();
        if ((eyalVar.b & 1) != 0) {
            String str = eyalVar.c;
            evxvVar.copyOnWrite();
            evxw evxwVar = (evxw) evxvVar.instance;
            str.getClass();
            evxwVar.b |= 1;
            evxwVar.c = str;
        }
        if ((eyalVar.b & 4) != 0) {
            eydq eydqVar = eyalVar.d;
            if (eydqVar == null) {
                eydqVar = eydq.a;
            }
            evxvVar.copyOnWrite();
            evxw evxwVar2 = (evxw) evxvVar.instance;
            eydqVar.getClass();
            evxwVar2.d = eydqVar;
            evxwVar2.b |= 2;
        }
        return (evxw) evxvVar.build();
    }
}

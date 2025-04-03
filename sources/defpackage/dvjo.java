package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvjo implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        exwn exwnVar = (exwn) obj;
        evwa evwaVar = (evwa) evwb.a.createBuilder();
        if ((exwnVar.b & 1) != 0) {
            emwl emwlVar = dvle.a;
            eybs b = eybs.b(exwnVar.c);
            if (b == null) {
                b = eybs.ANDROID_PERMISSION_TYPE_UNSPECIFIED;
            }
            Object apply = emwlVar.apply(b);
            evwaVar.copyOnWrite();
            evwb evwbVar = (evwb) evwaVar.instance;
            evwbVar.c = ((evsn) apply).a();
            evwbVar.b |= 1;
        }
        if ((exwnVar.b & 2) != 0) {
            int i = exwnVar.d;
            evwaVar.copyOnWrite();
            evwb evwbVar2 = (evwb) evwaVar.instance;
            evwbVar2.b |= 2;
            evwbVar2.d = i;
        }
        return (evwb) evwaVar.build();
    }
}

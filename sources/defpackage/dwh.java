package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dwh implements ffxy {
    final /* synthetic */ List a;
    final /* synthetic */ hho b;

    public dwh(List list, hho hhoVar) {
        this.a = list;
        this.b = hhoVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        dwm dwmVar = (dwm) obj;
        if (dwmVar instanceof dwf) {
            this.a.add(dwmVar);
        } else if (dwmVar instanceof dwg) {
            this.a.remove(((dwg) dwmVar).a);
        }
        this.b.b(Boolean.valueOf(!this.a.isEmpty()));
        return ffcu.a;
    }
}

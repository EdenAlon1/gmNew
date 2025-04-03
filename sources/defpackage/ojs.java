package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ojs implements ffxy {
    final /* synthetic */ ojv a;
    final /* synthetic */ ojf b;

    public ojs(ojv ojvVar, ojf ojfVar) {
        this.a = ojvVar;
        this.b = ojfVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        ogo ogoVar = (ogo) obj;
        if (oka.a(2)) {
            Objects.toString(ogoVar);
            oka.b(2, "Collected ".concat(String.valueOf(ogoVar)));
        }
        ojv ojvVar = this.a;
        Object a = ffra.a(ojvVar.b, new ojr(ogoVar, ojvVar, this.b, null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }
}

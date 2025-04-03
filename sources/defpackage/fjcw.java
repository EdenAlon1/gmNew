package defpackage;

import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjcw extends fjdm {
    final /* synthetic */ fjdm a;

    public fjcw(fjdm fjdmVar) {
        this.a = fjdmVar;
    }

    @Override // defpackage.fjdm
    public final void a(fjdr fjdrVar, Object obj) {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.a.a(fjdrVar, Array.get(obj, i));
        }
    }
}

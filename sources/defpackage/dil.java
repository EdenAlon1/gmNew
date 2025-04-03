package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dil extends ffkk implements ffji {
    public static final dil a = new dil();

    public dil() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        hqb hqbVar = (hqb) obj;
        int i = ded.a;
        Context context = (Context) hgc.b(hqbVar, AndroidCompositionLocals_androidKt.b);
        jzn jznVar = (jzn) hgc.b(hqbVar, jdr.e);
        dih dihVar = (dih) hgc.b(hqbVar, dij.a);
        if (dihVar == null) {
            return null;
        }
        return new dec(context, jznVar, dihVar.a, dihVar.b);
    }
}

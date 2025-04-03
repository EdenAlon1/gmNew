package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aibz extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ aica c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aibz(aica aicaVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = aicaVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aibz aibzVar = new aibz(this.c, (ffgu) obj3);
        aibzVar.a = (List) obj;
        aibzVar.b = (ahvn) obj2;
        return aibzVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r7 = this.a;
        if (((ahvn) this.b).a || r7.isEmpty()) {
            return null;
        }
        String string = this.c.c.getString(R.string.multi_share_mirror_extended_fab_text);
        string.getClass();
        return new dmyg(string, false, dmzz.u, new aiby(this.c), 2);
    }
}

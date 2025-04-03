package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yjr extends ffhv implements ffjm {
    final /* synthetic */ yjt a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjr(ffgu ffguVar, yjt yjtVar) {
        super(2, ffguVar);
        this.a = yjtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yjr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String string = this.a.a.getString(R.string.send_sound_pref_key);
        string.getClass();
        return Boolean.valueOf(this.a.c.q(string, this.a.a.getResources().getBoolean(R.bool.send_sound_pref_default)));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yjr yjrVar = new yjr(ffguVar, this.a);
        yjrVar.b = obj;
        return yjrVar;
    }
}

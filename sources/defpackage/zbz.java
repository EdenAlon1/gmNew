package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zbz extends ffhv implements ffjn {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ zcb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbz(zcb zcbVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = zcbVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zbz zbzVar = new zbz(this.c, (ffgu) obj3);
        zbzVar.a = booleanValue;
        zbzVar.b = (zch) obj2;
        return zbzVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        ((enrr) zcb.a.h().h("com/google/android/apps/messaging/conversation2/customthemes/SelectedThemeTracker$tonalPaletteProviderFlow$1", "invokeSuspend", 102, "SelectedThemeTracker.kt")).H("RichThemeEnabled: %b, selectedThemeId: %s", z, obj2 != null ? new Integer(((zch) obj2).a) : null);
        if (!z || obj2 == null) {
            this.c.e.a(true);
            hik hikVar = dopp.a;
            return new dopd();
        }
        this.c.e.a(false);
        final dwjy dwjyVar = ((zch) obj2).b;
        return new ffjm() { // from class: zbp
            @Override // defpackage.ffjm
            public final Object a(Object obj3, Object obj4) {
                ((Boolean) obj4).booleanValue();
                ((Context) obj3).getClass();
                return dwjy.this;
            }
        };
    }
}

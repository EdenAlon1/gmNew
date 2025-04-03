package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yor extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ String e;
    final /* synthetic */ you f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yor(String str, you youVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = str;
        this.f = youVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yor) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        String str;
        String str2;
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.d != 0) {
            Object obj3 = this.c;
            Object obj4 = this.b;
            Object obj5 = this.a;
            ffci.b(obj);
            str = obj3;
            obj2 = obj4;
            str2 = obj5;
        } else {
            ffci.b(obj);
            String str3 = this.e;
            final String str4 = str3.length() == 0 ? null : str3;
            final ffkx ffkxVar = new ffkx();
            String str5 = this.f.d.a(new ffji() { // from class: yoq
                @Override // defpackage.ffji
                public final Object invoke(Object obj6) {
                    xhu xhuVar = (xhu) obj6;
                    String str6 = xhuVar.a;
                    String str7 = str4;
                    boolean e = ffkj.e(str6, str7);
                    ffkx ffkxVar2 = ffkxVar;
                    if (e) {
                        ffkxVar2.a = false;
                        return xhuVar;
                    }
                    xhu c = xhu.c(xhuVar, str7, null, null, false, null, null, false, 1, 766);
                    ffkxVar2.a = true;
                    return c;
                }
            }).a;
            if (ffkxVar.a) {
                you youVar = this.f;
                Integer num = new Integer(youVar.k.get());
                this.a = str4;
                this.b = ffkxVar;
                this.c = str5;
                this.d = 1;
                if (youVar.l.fQ(num, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            str = str5;
            obj2 = ffkxVar;
            str2 = str4;
        }
        if (str2 == null || str == null) {
            ensk h = you.a.h();
            h.Y(ente.a, "BugleComposeRow2");
            ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$textChangeListener$1$onTextChanged$1", "invokeSuspend", 150, "DraftTextUiAdapterImpl.kt")).J("Draft text field onTextChanged, updated %b, with old and/or incoming empty: %s, %s", Boolean.valueOf(((ffkx) obj2).a), str != null ? cskw.b(str) : null, str2 != null ? cskw.b(str2) : null);
        } else {
            ffkx ffkxVar2 = (ffkx) obj2;
            if (ffkxVar2.a) {
                ensk f = you.a.f();
                f.Y(ente.a, "BugleComposeRow2");
                enrr enrrVar = (enrr) ((enrr) f).f(String.valueOf(ffkxVar2.a));
                enrrVar.W(5, TimeUnit.SECONDS);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl$textChangeListener$1$onTextChanged$1", "invokeSuspend", 161, "DraftTextUiAdapterImpl.kt")).H("Draft text field onTextChanged, updated %b, incoming %s, ", ffkxVar2.a, cskw.b(this.e));
            }
        }
        if (((Boolean) ctjd.aP.e()).booleanValue() && this.f.e.isPresent() && ((wmu) this.f.e.get()).o()) {
            ((wmu) this.f.e.get()).n(this.e);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yor(this.e, this.f, ffguVar);
    }
}

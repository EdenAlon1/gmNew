package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaml extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aamn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaml(aamn aamnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aamnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaml) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        aamn aamnVar;
        Exception e;
        Boolean bool;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            aamnVar = (aamn) this.c;
            try {
                ffci.b(obj);
            } catch (Exception e2) {
                e = e2;
                if ((e instanceof IOException) && !(e instanceof dezu)) {
                    throw e;
                }
                ((enrr) ((enrr) aamn.a.i()).g(e).h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/text/LinkPreviewUiAdapter$1", "invokeSuspend", 72, "LinkPreviewUiAdapter.kt")).q("Failed to fetch account capability");
                bool = false;
                aamnVar.l = bool.booleanValue();
                this.b.m = true;
                return ffcu.a;
            }
        } else {
            ffci.b(obj);
            aamn aamnVar2 = this.b;
            try {
                elfl b = aamnVar2.f.b(adhu.a() ? aamnVar2.h : null);
                this.c = aamnVar2;
                this.a = 1;
                Object c = fgfz.c(b, this);
                if (c == ffhhVar) {
                    return ffhhVar;
                }
                aamnVar = aamnVar2;
                obj = c;
            } catch (Exception e3) {
                aamnVar = aamnVar2;
                e = e3;
                if (e instanceof IOException) {
                }
                ((enrr) ((enrr) aamn.a.i()).g(e).h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/text/LinkPreviewUiAdapter$1", "invokeSuspend", 72, "LinkPreviewUiAdapter.kt")).q("Failed to fetch account capability");
                bool = false;
                aamnVar.l = bool.booleanValue();
                this.b.m = true;
                return ffcu.a;
            }
        }
        bool = (Boolean) obj;
        aamnVar.l = bool.booleanValue();
        this.b.m = true;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aaml aamlVar = new aaml(this.b, ffguVar);
        aamlVar.c = obj;
        return aamlVar;
    }
}

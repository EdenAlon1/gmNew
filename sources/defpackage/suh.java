package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.time.MonthDay;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class suh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ResolvedRecipient b;
    final /* synthetic */ sui c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suh(ResolvedRecipient resolvedRecipient, sui suiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = resolvedRecipient;
        this.c = suiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((suh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ResolvedRecipient resolvedRecipient = this.b;
            if (resolvedRecipient != null) {
                sui suiVar = this.c;
                Uri e = resolvedRecipient.e();
                aoku g = resolvedRecipient.g();
                MonthDay c = sth.c(suiVar.h.a);
                ContentValues contentValues = new ContentValues();
                contentValues.put("mimetype", "vnd.android.cursor.item/contact_event");
                contentValues.put("data2", (Integer) 3);
                contentValues.put("data1", c.toString());
                engw r = engw.r(contentValues);
                r.getClass();
                suiVar.g.h(new aijl(e, g, 11, r));
            }
            sui suiVar2 = this.c;
            ffhd a = ekxi.a(suiVar2.b);
            sug sugVar = new sug(null, suiVar2);
            this.a = 1;
            if (ffra.a(a, sugVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new suh(this.b, this.c, ffguVar);
    }
}

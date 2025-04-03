package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class davj extends cslh {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean k;
    final /* synthetic */ davk l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public davj(davk davkVar, String str, String str2, boolean z, boolean z2) {
        super("Bugle.Async.Debug.createFakeTelephonyConversations.Duration", null);
        this.a = str;
        this.b = str2;
        this.c = z;
        this.k = z2;
        this.l = davkVar;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        String str = TextUtils.isEmpty(this.a) ? "5555550000" : this.a;
        ContentValues a = davk.a(str, TextUtils.isEmpty(this.b) ? "Test msg" : this.b, this.l.f.f().toEpochMilli(), this.l.g.e(str), -1L, false, this.c, this.k);
        Uri insert = this.l.h.getContentResolver().insert(Telephony.Sms.Inbox.CONTENT_URI, a);
        coxg coxgVar = (coxg) this.l.j.b();
        insert.getClass();
        Object obj = a.get("date");
        obj.getClass();
        coxgVar.m(insert, Instant.ofEpochMilli(((Long) obj).longValue()));
        return null;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        if (this.c || this.k) {
            this.l.k.l("Telephony DB populated. Now syncing...");
        } else {
            this.l.k.l("Notification should be posted soon, ensure notifications are enabled.");
        }
    }
}

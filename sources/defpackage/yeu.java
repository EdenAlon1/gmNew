package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yeu extends ffhv implements ffjm {
    final /* synthetic */ xhs a;
    final /* synthetic */ bswn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yeu(ffgu ffguVar, xhs xhsVar, bswn bswnVar) {
        super(2, ffguVar);
        this.a = xhsVar;
        this.b = bswnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yeu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bswn bswnVar = this.b;
        bswnVar.az(5, "replied_to_message_id");
        String str = bswnVar.f;
        CoreBugleMessageId coreBugleMessageId = str != null ? new CoreBugleMessageId(bdhb.b(str), -1L) : null;
        xhh xhhVar = (xhh) this.a;
        xhhVar.e = coreBugleMessageId;
        xhhVar.g = (short) (xhhVar.g | 16);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yeu yeuVar = new yeu(ffguVar, this.a, this.b);
        yeuVar.c = obj;
        return yeuVar;
    }
}

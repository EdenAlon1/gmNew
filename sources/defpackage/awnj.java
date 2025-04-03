package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awnj extends ffhv implements ffjm {
    final /* synthetic */ Uri a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awnj(ffgu ffguVar, Uri uri, ConversationIdType conversationIdType) {
        super(2, ffguVar);
        this.a = uri;
        this.b = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awnj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("updateRcsGroupIconUrl");
        Uri uri = this.a;
        boolean e = ffkj.e(uri, Uri.EMPTY);
        Boolean.valueOf(e).getClass();
        if (true == e) {
            uri = null;
        }
        bsoeVar.P(uri);
        bsoeVar.am();
        return Boolean.valueOf(bsoeVar.f(this.b));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        awnj awnjVar = new awnj(ffguVar, this.a, this.b);
        awnjVar.c = obj;
        return awnjVar;
    }
}

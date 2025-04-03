package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deed extends ffhv implements ffjm {
    int a;
    final /* synthetic */ deee b;
    final /* synthetic */ Intent c;
    final /* synthetic */ ConversationId d;
    final /* synthetic */ String e;
    final /* synthetic */ boolean f;
    final /* synthetic */ boolean g;
    final /* synthetic */ boolean h;
    final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deed(deee deeeVar, Intent intent, ConversationId conversationId, String str, boolean z, boolean z2, boolean z3, boolean z4, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = deeeVar;
        this.c = intent;
        this.d = conversationId;
        this.e = str;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((deed) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        deee deeeVar = this.b;
        Intent intent = this.c;
        ConversationId conversationId = this.d;
        String str = this.e;
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        boolean z4 = this.i;
        this.a = 1;
        if (deeeVar.a(intent, conversationId, str, z, z2, z3, z4, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new deed(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, ffguVar);
    }
}

package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caju extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Conversation b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caju(ffgu ffguVar, Conversation conversation) {
        super(2, ffguVar);
        this.b = conversation;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caju) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            elfl b = this.b.h().b();
            b.getClass();
            this.a = 1;
            obj = fgfz.c(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        aqux f = ((alxj) obj).f();
        if (f != null) {
            return f;
        }
        throw new IllegalArgumentException("Failed to retrieve selected conversation identity");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        caju cajuVar = new caju(ffguVar, this.b);
        cajuVar.c = obj;
        return cajuVar;
    }
}

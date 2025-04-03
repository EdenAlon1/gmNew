package defpackage;

import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.Scope;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzzx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ caag b;
    final /* synthetic */ enpj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzzx(ffgu ffguVar, caag caagVar, enpj enpjVar) {
        super(2, ffguVar);
        this.b = caagVar;
        this.c = enpjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzzx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Scope scope;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            scope = (Scope) this.d;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            this.b.b.b();
            Scope create = Scope.create(((cafi) this.b.f.b()).b());
            elfl b = ((bzvx) this.b.h.b()).b(this.b.l.d);
            b.getClass();
            this.d = create;
            this.a = 1;
            Object c = fgfz.c(b, this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
            scope = create;
            obj = c;
        }
        return Boolean.valueOf(((ArrayList) cafo.a(((NativeMessageEncryptorV2) obj).checkMissingSessions(scope, enkr.a(this.c.v())))).isEmpty());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bzzx bzzxVar = new bzzx(ffguVar, this.b, this.c);
        bzzxVar.d = obj;
        return bzzxVar;
    }
}

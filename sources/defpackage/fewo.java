package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fewo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ String c = GroupManagementRequest.XML_TAG;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fewo(ffxx ffxxVar, Object obj, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.d = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fewo) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffkx ffkxVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffkxVar = (ffkx) this.e;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ffxy ffxyVar = (ffxy) this.e;
            ffkx ffkxVar2 = new ffkx();
            ffxx ffxxVar = this.b;
            fewn fewnVar = new fewn(ffkxVar2, ffxyVar, this.d);
            this.e = ffkxVar2;
            this.a = 1;
            if (ffxxVar.a(fewnVar, this) == ffhhVar) {
                return ffhhVar;
            }
            ffkxVar = ffkxVar2;
        }
        if (ffkxVar.a) {
            return ffcu.a;
        }
        String str = this.c;
        Object obj2 = this.d;
        throw new StatusException(Status.o.withDescription("Expected one " + str + " for " + obj2 + " but received none"));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        fewo fewoVar = new fewo(this.b, this.d, ffguVar);
        fewoVar.e = obj;
        return fewoVar;
    }
}

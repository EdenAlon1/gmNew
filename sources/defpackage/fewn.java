package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fewn implements ffxy {
    final /* synthetic */ ffkx a;
    final /* synthetic */ ffxy b;
    final /* synthetic */ String c = GroupManagementRequest.XML_TAG;
    final /* synthetic */ Object d;

    public fewn(ffkx ffkxVar, ffxy ffxyVar, Object obj) {
        this.a = ffkxVar;
        this.b = ffxyVar;
        this.d = obj;
    }

    @Override // defpackage.ffxy
    public final Object fQ(Object obj, ffgu ffguVar) {
        ffkx ffkxVar = this.a;
        if (!ffkxVar.a) {
            ffkxVar.a = true;
            Object fQ = this.b.fQ(obj, ffguVar);
            return fQ == ffhh.a ? fQ : ffcu.a;
        }
        String str = this.c;
        Object obj2 = this.d;
        throw new StatusException(Status.o.withDescription("Expected one " + str + " for " + obj2 + " but received two"));
    }
}

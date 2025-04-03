package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cakl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cakn b;
    final /* synthetic */ capz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cakl(cakn caknVar, capz capzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = caknVar;
        this.c = capzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cakl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
                return obj;
            }
            ffci.b(obj);
            cakn caknVar = this.b;
            ejvb ejvbVar = caknVar.c;
            capz capzVar = this.c;
            cakx cakxVar = (cakx) caknVar.b.b();
            ffsk ffskVar = (ffsk) cakxVar.a.b();
            ffskVar.getClass();
            ffhd ffhdVar = (ffhd) cakxVar.b.b();
            ffhdVar.getClass();
            ffbr ffbrVar = cakxVar.c;
            ffbr ffbrVar2 = cakxVar.d;
            ffbr ffbrVar3 = cakxVar.e;
            ffbr ffbrVar4 = cakxVar.f;
            cqoh cqohVar = (cqoh) cakxVar.g.b();
            cqohVar.getClass();
            ListenableFuture b = ejvbVar.b(new cakw(ffskVar, ffhdVar, ffbrVar, ffbrVar2, ffbrVar3, ffbrVar4, cqohVar, cakxVar.h, capzVar), ejwa.DONT_CARE);
            b.getClass();
            this.a = 1;
            Object c = fgfz.c(b, this);
            return c == ffhhVar ? ffhhVar : c;
        } catch (Exception e) {
            csjb e2 = cakn.a.e();
            e2.I("Failed to retrieve E2eeInfo as future");
            e2.s(e);
            if ((e instanceof IllegalStateException) || (e instanceof capq) || (e instanceof ExecutionException)) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cakl(this.b, this.c, ffguVar);
    }
}

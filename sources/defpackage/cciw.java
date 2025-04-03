package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cciw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ccix b;
    final /* synthetic */ long c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cciw(ffgu ffguVar, ccix ccixVar, long j) {
        super(2, ffguVar);
        this.b = ccixVar;
        this.c = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cciw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        long k;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ccix ccixVar = this.b;
            long j = this.c;
            this.a = 1;
            obj = ffra.a(ekxi.a(ccixVar.f), new ccis(null, j), this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        bqld bqldVar = (bqld) obj;
        bqmn bqmnVar = bqmn.a;
        if (bqldVar == null) {
            long j2 = this.c;
            ccix.a.p("No deleted message entry in buffer for message " + j2);
            k = -1;
        } else {
            long j3 = this.c;
            ccix.a.p("Message deleted entry found for message " + j3 + ". Deletion reason = " + bqldVar.l());
            if (!((asis) this.b.d.b()).a()) {
                ((axdf) this.b.c.b()).p(Arrays.asList(new MessageIdType(this.c)), bqldVar.k(), bqldVar.l());
                return ffcu.a;
            }
            k = bqldVar.k();
            bqmnVar = bqldVar.l();
        }
        if (((asis) this.b.d.b()).a()) {
            ((axdf) this.b.c.b()).p(Arrays.asList(new MessageIdType(this.c)), k, bqmnVar);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cciw cciwVar = new cciw(ffguVar, this.b, this.c);
        cciwVar.d = obj;
        return cciwVar;
    }
}

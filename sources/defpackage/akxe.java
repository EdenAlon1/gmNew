package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akxe extends dtrs {
    final /* synthetic */ akxf a;

    public akxe(akxf akxfVar) {
        this.a = akxfVar;
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        MessagesTable.BindData bindData = (MessagesTable.BindData) dtukVar.b();
        if (bindData == null) {
            final buxq buxqVar = (buxq) dtukVar.d();
            if (buxqVar != null) {
                final akxf akxfVar = this.a;
                buxqVar.m(new duao() { // from class: akwt
                    @Override // defpackage.duao
                    public final boolean a(duaw duawVar) {
                        if (!(duawVar instanceof dtrt)) {
                            return false;
                        }
                        dtrt dtrtVar = (dtrt) duawVar;
                        if (!dktk.a(dtrtVar.d, MessagesTable.c.a.toString()) || dtrtVar.b != 1) {
                            return false;
                        }
                        akxf.this.g(bdhb.b(dtrtVar.a), buxqVar.a(), Optional.empty());
                        return true;
                    }
                });
            }
            buxs buxsVar = (buxs) dtukVar.e();
            if (buxsVar != null) {
                final akxf akxfVar2 = this.a;
                buxsVar.f(new duao() { // from class: akwu
                    @Override // defpackage.duao
                    public final boolean a(duaw duawVar) {
                        akxf akxfVar3 = akxf.this;
                        if (duawVar instanceof dtrt) {
                            dtrt dtrtVar = (dtrt) duawVar;
                            if (akxf.i(dtrtVar.d) && dtrtVar.b == 1) {
                                akxfVar3.h(bdhb.b(dtrtVar.a), aliu.MESSAGE_DELETED, Optional.empty());
                                return true;
                            }
                        }
                        if (duawVar instanceof dtrw) {
                            dtrw dtrwVar = (dtrw) duawVar;
                            if (!akxf.i(dtrwVar.d) || dtrwVar.c - 1 != 2) {
                                return false;
                            }
                            Iterator it = dtrwVar.b.iterator();
                            while (it.hasNext()) {
                                akxfVar3.h(bdhb.b((String) it.next()), aliu.MESSAGE_DELETED, Optional.empty());
                            }
                        }
                        return false;
                    }
                });
                return;
            }
            return;
        }
        akxf akxfVar3 = this.a;
        MessageIdType D = bindData.D();
        if (D == null) {
            return;
        }
        Object ax = bindData.ax(eooi.class.getName());
        String num = ax instanceof eooi ? Integer.toString(((eooi) ax).J) : null;
        if (bindData.ax("mismatchedThreadId") instanceof Boolean) {
            if (num != null) {
                num = num.concat(" ");
            }
            num = String.valueOf(num).concat(String.valueOf(aliu.THREAD_ID_MISMATCH.d));
        }
        akxfVar3.g(D, bindData.s(), Optional.ofNullable(num));
    }
}

package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvvl extends dtyq<bvti, bvvl, bvvn, ParticipantsTable.BindData, bvth> {
    public bvvl(dtza dtzaVar) {
        super(dtzaVar);
    }

    @Override // defpackage.dtyq
    public final /* synthetic */ dtsu a(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar) {
        return new bvvd(dtveVar, cursor, strArr, dtzjVarArr, dtyoVar, dtvsVar, this);
    }

    @Override // defpackage.dtyq
    protected final Map b() {
        String[] strArr = ParticipantsTable.a;
        return new HashMap();
    }

    @Override // defpackage.dtyq
    protected final boolean c() {
        return false;
    }

    @Override // defpackage.dtyq
    protected final String[] d() {
        return new String[0];
    }

    @Override // defpackage.dtyq
    protected final String[] e() {
        return new String[0];
    }

    public final engw f() {
        bvti bvtiVar = (bvti) p(ParticipantsTable.c.a);
        try {
            engw l = bvtiVar.l();
            bvtiVar.close();
            return l;
        } catch (Throwable th) {
            try {
                bvtiVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final engw g() {
        bvti bvtiVar = (bvti) p(ParticipantsTable.c.d);
        try {
            engw o = bvtiVar.o();
            bvtiVar.close();
            return o;
        } catch (Throwable th) {
            try {
                bvtiVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

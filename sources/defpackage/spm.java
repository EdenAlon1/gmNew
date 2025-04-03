package defpackage;

import android.os.ParcelFileDescriptor;
import com.android.vcard.VCardConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spm extends ffhv implements ffjm {
    final /* synthetic */ spw a;
    final /* synthetic */ UUID b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spm(ffgu ffguVar, spw spwVar, UUID uuid) {
        super(2, ffguVar);
        this.a = spwVar;
        this.b = uuid;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        spw spwVar = this.a;
        snw snwVar = spwVar.d;
        boolean a = spwVar.j.a();
        Boolean.valueOf(a).getClass();
        File a2 = snwVar.a.a(true != a ? null : this.b);
        if (a2 == null) {
            throw new sqq("Unable to open the backup database file");
        }
        try {
            ParcelFileDescriptor open = ParcelFileDescriptor.open(a2, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            try {
                long statSize = open.getStatSize();
                ffig.a(open, null);
                return new Long(statSize);
            } finally {
            }
        } catch (FileNotFoundException e) {
            ((ensz) ((ensz) snwVar.b.j()).g(e)).q("Unable to get size of backup database");
            throw new sqq("Unable to open the backup database file", e);
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        spm spmVar = new spm(ffguVar, this.a, this.b);
        spmVar.c = obj;
        return spmVar;
    }
}

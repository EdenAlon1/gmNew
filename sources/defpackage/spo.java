package defpackage;

import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spo extends ffhv implements ffjm {
    final /* synthetic */ spw a;
    final /* synthetic */ long b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spo(ffgu ffguVar, spw spwVar, long j) {
        super(2, ffguVar);
        this.a = spwVar;
        this.b = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Uri t;
        ffci.b(obj);
        spw spwVar = this.a;
        snw snwVar = spwVar.d;
        int longValue = (int) ((Number) spwVar.c.b()).longValue();
        final long j = this.b;
        if (j < 0 || longValue < 0) {
            return ffel.a;
        }
        bwdf c = PartsTable.c();
        c.z("gatherAttachments");
        c.h(new Function() { // from class: snu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bwdm bwdmVar = (bwdm) obj2;
                bwdmVar.getClass();
                bwdmVar.x();
                bwdmVar.aq(new dtrw("parts.uri", 4, enkr.g(Arrays.asList(Uri.parse("")), new emwl() { // from class: duat
                    @Override // defpackage.emwl
                    public final Object apply(Object obj3) {
                        if (obj3 == null) {
                            return null;
                        }
                        return obj3 instanceof Enum ? Integer.toString(((Enum) obj3).ordinal()) : DatabaseUtils.sqlEscapeString(obj3.toString());
                    }
                }), false));
                bwdmVar.aq(new dtwe("parts._id", 8, Long.valueOf(j)));
                return bwdmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        c.d(new bwdc(PartsTable.d.a, false));
        c.x(longValue);
        engw y = c.b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList();
        enqv it = y.iterator();
        it.getClass();
        while (it.hasNext()) {
            PartsTable.BindData bindData = (PartsTable.BindData) it.next();
            try {
                bindData.getClass();
                t = bindData.t();
            } catch (sqq e) {
                ensz enszVar = (ensz) snwVar.b.j();
                enszVar.Y(csux.s, bindData.J());
                enszVar.Y(csux.X, bindData.t());
                ((ensz) enszVar.g(e)).q("Unable to get metadata for attachment, skipping attachment for back up");
            }
            if (t == null) {
                ensz enszVar2 = (ensz) snwVar.b.j();
                enszVar2.Y(csux.s, bindData.J());
                enszVar2.q("Could not get file size, Uri is null");
                throw new sqq("Could not get file size, Uri is null");
            }
            String J = bindData.J();
            J.getClass();
            ParcelFileDescriptor a = snwVar.a(t, J, snwVar.b(t));
            try {
                if (a.getStatSize() == 0) {
                    ensz enszVar3 = (ensz) snwVar.b.j();
                    enszVar3.Y(csux.s, J);
                    enszVar3.Y(csux.X, t);
                    enszVar3.q("Could not get file size, file is empty");
                    throw new sqq("Could not get file size, file is empty");
                }
                long statSize = a.getStatSize();
                ffig.a(a, null);
                ((ensz) snwVar.b.g()).A("Read file size [%d] bytes from uri [%s]", statSize, t);
                String J2 = bindData.J();
                J2.getClass();
                long parseLong = Long.parseLong(J2);
                MessageIdType v = bindData.v();
                v.getClass();
                arrayList.add(new sny(parseLong, v, statSize, bindData.H()));
            } finally {
            }
        }
        return arrayList;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        spo spoVar = new spo(ffguVar, this.a, this.b);
        spoVar.c = obj;
        return spoVar;
    }
}

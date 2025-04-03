package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bckf {
    public static final bckn a;
    public static final bckn b;
    public static final bckn c;
    public static final bckn d;
    public static final bckn e;
    public static final bckn f;
    public static final bckn g;
    public static final bckn h;
    public static final bckn i;
    public static final bckn j;
    public static final bckn k;

    static {
        String[] strArr = bsom.a;
        a = new bckn("conversations");
        String[] strArr2 = MessagesTable.a;
        b = new bckn("messages");
        String[] strArr3 = ParticipantsTable.a;
        c = new bckn("participants");
        String[] strArr4 = azoi.a;
        new bckn("my_identities");
        String[] strArr5 = PartsTable.a;
        d = new bckn("parts");
        String[] strArr6 = brww.a;
        e = new bckn("conversation_participants");
        String[] strArr7 = bsdr.a;
        f = new bckn("conversation_to_participants");
        String[] strArr8 = bumm.a;
        g = new bckn("message_star");
        String[] strArr9 = bryh.a;
        h = new bckn("conversation_pin");
        String[] strArr10 = bueg.a;
        i = new bckn("message_reactions");
        String[] strArr11 = bufy.a;
        j = new bckn("message_replies");
        String[] strArr12 = btul.a;
        k = new bckn("message_captions");
        String[] strArr13 = btqq.a;
        new bckn("link_preview");
    }

    public static /* synthetic */ dtzj a(dtyx dtyxVar, dtry dtryVar, dtry dtryVar2, final bckn bcknVar, final bckn bcknVar2) {
        bcknVar.getClass();
        bcknVar2.getClass();
        String[] strArr = bqea.a;
        bqdv bqdvVar = new bqdv(bqea.a);
        bqdh bqdhVar = bqea.c;
        bqdvVar.c(bqdhVar.c, bqdhVar.a);
        bqdvVar.d(new Function() { // from class: bckd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqdz bqdzVar = (bqdz) obj;
                bckn bcknVar3 = bckf.a;
                bqdzVar.f(bckn.this.a);
                return bqdzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtyxVar.u();
        bqdv bqdvVar2 = new bqdv(bqea.a);
        bqdvVar2.u();
        bqdvVar2.d(new Function() { // from class: bcke
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqdz bqdzVar = (bqdz) obj;
                bckn bcknVar3 = bckf.a;
                bqdzVar.f(bckn.this.a);
                bqdzVar.c(1L);
                return bqdzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtvy i2 = dtvz.i(bqdvVar2.b(), bqea.c.c, dtryVar);
        ((dtrd) i2).e = "backup_table_join_map";
        dtvy i3 = dtvz.i(dtyxVar.j(i2).b(), dtryVar2, bqea.c.c);
        ((dtrd) i3).e = "backup_id_map";
        return ((bqdv) bqdvVar.j(i3)).b();
    }
}

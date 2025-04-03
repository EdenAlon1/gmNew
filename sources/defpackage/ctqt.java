package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctqt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctrc b;
    final /* synthetic */ ConversationIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctqt(ffgu ffguVar, ctrc ctrcVar, ConversationIdType conversationIdType) {
        super(2, ffguVar);
        this.b = ctrcVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctqt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Closeable closeable;
        Throwable th;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            closeable = (Closeable) this.d;
            try {
                ffci.b(obj);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    ffig.a(closeable, th);
                    throw th3;
                }
            }
        } else {
            ffci.b(obj);
            if (!ekxi.b(u())) {
                throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ekzz f = eleg.f("SmartSuggestionDatabaseOperations#hasSharedEmotiveContent");
            try {
                engw u = engw.u(new Integer(11), new Integer(26), new Integer(34), new Integer(35));
                u.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("(");
                sb.append(cbqn.a(null, this.c, engw.r("image/gif")));
                sb.append(")");
                enqv it = u.iterator();
                while (it.hasNext()) {
                    String format = String.format(Locale.US, " OR %s = %d", Arrays.copyOf(new Object[]{PartsTable.d.x, new Integer(((Number) it.next()).intValue())}, 2));
                    format.getClass();
                    sb.append(format);
                }
                String sb2 = sb.toString();
                blra a = MediaSearchQuery.a();
                a.z("+hasSharedEmotiveContent");
                a.r();
                a.e(new ctqu(sb2));
                a.c(new blqx(MediaSearchQuery.b.a));
                if (((Number) ctjd.G.e()).intValue() >= 0) {
                    Object e = ctjd.G.e();
                    e.getClass();
                    a.x(((Number) e).intValue());
                }
                ffhd a2 = ekxi.a(this.b.a);
                ctqv ctqvVar = new ctqv(null, a);
                this.d = f;
                this.a = 1;
                Object a3 = ffra.a(a2, ctqvVar, this);
                if (a3 == ffhhVar) {
                    return ffhhVar;
                }
                closeable = f;
                obj = a3;
            } catch (Throwable th4) {
                closeable = f;
                th = th4;
                throw th;
            }
        }
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        ffig.a(closeable, null);
        return bool;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctqt ctqtVar = new ctqt(ffguVar, this.b, this.c);
        ctqtVar.d = obj;
        return ctqtVar;
    }
}

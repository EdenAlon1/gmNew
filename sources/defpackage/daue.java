package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daue extends cslh {
    public static final /* synthetic */ int c = 0;
    final /* synthetic */ Activity a;
    final /* synthetic */ dauv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daue(dauv dauvVar, Activity activity) {
        super("Bugle.Async.DebugUtils.showUnreadMessagesDialog.Duration");
        this.a = activity;
        this.b = dauvVar;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        ((ctyx) this.b.q.b()).h(this.a.getString(R.string.link_preview_tombstone_seen_pref_key), false);
        ((ctyx) this.b.q.b()).k(this.a.getString(R.string.link_preview_tombstone_first_shown_millis_pref_key), -1L);
        String[] strArr = btqq.a;
        new btqg().d();
        String[] strArr2 = MessagesTable.a;
        buxh buxhVar = new buxh();
        buxhVar.c(new Function() { // from class: daud
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                int i = daue.c;
                buxzVar.af(210);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxhVar.d();
        return null;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        ((ddzb) this.b.Y.b()).l("Link Previews reset to first view.");
    }
}

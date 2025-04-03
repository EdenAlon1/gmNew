package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.HashSet;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afcf extends dtrs {
    public static final /* synthetic */ int b = 0;
    public final Consumer a;
    private final ffbr c;
    private final ffbr d;

    public afcf(Consumer consumer, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = consumer;
        this.c = ffbrVar;
        this.d = ffbrVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtrs
    public final /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        bwdh bwdhVar;
        if (aewg.h() && (bwdhVar = (bwdh) dtukVar.d()) != null) {
            if (bwdhVar.n("preview_content_type") || bwdhVar.n("preview_content_uri") || bwdhVar.n("content_type") || bwdhVar.n(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI)) {
                bwdf c = PartsTable.c();
                c.z("MessagePartUpdateListener#onChangeInTransaction");
                enqv it = bwdhVar.e.iterator();
                while (it.hasNext()) {
                    c.k((bwdj) ((duap) it.next()));
                }
                HashSet hashSet = new HashSet();
                bwav bwavVar = (bwav) c.b().o();
                while (bwavVar.moveToNext()) {
                    try {
                        bdot C = ((bcwz) this.c.b()).e((PartsTable.BindData) bwavVar.cO()).C();
                        MessageIdType k = bwavVar.k();
                        if (!k.c() && !TextUtils.isEmpty(((bdos) C).a) && le.q(((bdos) C).a)) {
                            hashSet.add(new afat(k.b(), ((bdos) C).a, ((bdos) C).b));
                        }
                    } catch (Throwable th) {
                        try {
                            bwavVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bwavVar.close();
                if (hashSet.isEmpty()) {
                    return;
                }
                final engw n = engw.n(hashSet);
                ((dtuu) this.d.b()).g(new dtut() { // from class: afcc
                    @Override // defpackage.dtut
                    public final ekzz a() {
                        int i = afcf.b;
                        return eleg.f("MPUL::runAfterCommit");
                    }
                }, String.valueOf(n.hashCode()), new Runnable() { // from class: afcd
                    @Override // java.lang.Runnable
                    public final void run() {
                        afcf.this.a.o(n);
                    }
                });
            }
        }
    }
}

package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbds implements bqab {
    public static final /* synthetic */ int b = 0;
    private static final entd c = entd.c("BugleJobs");
    public final ffbr a;
    private final cbdr d = new cbdr(this);
    private final AtomicBoolean e = new AtomicBoolean(false);
    private Supplier f;

    public cbds(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    @Override // defpackage.bqab
    public final void a() {
        final emyl a = emys.a(new emyl() { // from class: cbdm
            @Override // defpackage.emyl
            public final Object get() {
                int i = cbds.b;
                String[] strArr = VmtTable.a;
                byyg byygVar = new byyg(VmtTable.a);
                byygVar.z("VmtTableChangeObserver-transcriptions");
                byygVar.d(new Function() { // from class: cbdk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        byxv byxvVar = (byxv) obj;
                        int i2 = cbds.b;
                        return new byxw[]{byxvVar.a, byxvVar.b};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                byygVar.e(new Function() { // from class: cbdl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        byyk byykVar = (byyk) obj;
                        int i2 = cbds.b;
                        byykVar.c(ardn.VMT_STATUS_COMPLETE);
                        return byykVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return byygVar.b();
            }
        });
        a.getClass();
        this.f = new Supplier() { // from class: cbdn
            @Override // java.util.function.Supplier
            public final Object get() {
                return (byyf) emyl.this.get();
            }
        };
    }

    @Override // defpackage.bqab
    public final void fF() {
        Object obj;
        if (!this.e.compareAndSet(false, true)) {
            ((ensz) ((ensz) c.j()).h("com/google/android/apps/messaging/shared/datamodel/observer/VmtTableContentChangeObserver", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 77, "VmtTableContentChangeObserver.java")).q("Already started vmt table content change observer.");
        } else {
            obj = this.f.get();
            ((byyf) obj).L(this.d);
        }
    }
}

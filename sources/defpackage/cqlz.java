package defpackage;

import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqlz implements ejny {
    static final cfva a = cfvl.r(160232109, "enable_work_item");
    public static final /* synthetic */ int b = 0;
    private final cqlk c;

    public cqlz(cqlk cqlkVar) {
        this.c = cqlkVar;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(WorkerParameters workerParameters) {
        if (!((Boolean) a.e()).booleanValue()) {
            return elfo.e(new ppp());
        }
        final cqlk cqlkVar = this.c;
        return elfo.f(new Runnable() { // from class: cqlf
            @Override // java.lang.Runnable
            public final void run() {
                cqlk cqlkVar2 = cqlk.this;
                if (!cqlkVar2.f()) {
                    cqlk.a.r("Removing entire cache of sms/mms - missing sms/mms permission");
                    cqlkVar2.b(0L);
                    return;
                }
                File[] listFiles = cqlkVar2.a().listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        Matcher matcher = cqlk.b.matcher(file.getName());
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            emyw.e(group);
                            if (PartsTable.a(group) == null && !cqlk.d(file)) {
                                csjb e = cqlk.a.e();
                                e.I("Unable to delete orphaned file");
                                e.A("fileName", file.getName());
                                e.r();
                            }
                        }
                    }
                }
            }
        }, cqlkVar.c).h(new emwl() { // from class: cqly
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = cqlz.b;
                return new ppp();
            }
        }, erpp.a);
    }
}

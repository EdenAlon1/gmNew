package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecet implements eceu {
    public ecea a;
    final Set b;
    public final eceo c;
    private final Executor d;
    private final Executor e;

    public ecet(Executor executor, Set set, eceo eceoVar) {
        this.d = executor;
        this.c = eceoVar;
        this.e = new ersb(executor);
        this.b = set;
    }

    @Override // defpackage.eceq
    public final ListenableFuture a(final ecep ecepVar) {
        return erqt.l(new Runnable() { // from class: eces
            @Override // java.lang.Runnable
            public final void run() {
                ecet ecetVar = ecet.this;
                if (ecetVar.a == null) {
                    ecetVar.a = (ecea) ecel.a.createBuilder();
                }
                if (ecepVar.a(ecetVar.a)) {
                    eceo eceoVar = ecetVar.c;
                    ecel ecelVar = (ecel) ecetVar.a.build();
                    int i = ecelVar.b;
                    if ((i & 1) != 0 && (i & 2) != 0 && ecelVar.c >= 0) {
                        eyja eyjaVar = ecelVar.d;
                        if (eyjaVar == null) {
                            eyjaVar = eyja.a;
                        }
                        if (eyjaVar.b >= 0) {
                            File file = new File(eceoVar.a.getFilesDir(), "flight_records");
                            if (file.exists() || file.mkdirs()) {
                                Locale locale = Locale.US;
                                Long valueOf = Long.valueOf(ecelVar.c);
                                eyja eyjaVar2 = ecelVar.d;
                                if (eyjaVar2 == null) {
                                    eyjaVar2 = eyja.a;
                                }
                                File file2 = new File(file, String.format(locale, "%d_%s", valueOf, Long.valueOf(eyjaVar2.b)));
                                try {
                                    if (file2.createNewFile()) {
                                        ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 52, "FlightRecordWriterImpl.java")).q("Created new file successfully");
                                    } else {
                                        ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 50, "FlightRecordWriterImpl.java")).q("File already exists, overwriting the previous record");
                                    }
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        ecelVar.writeTo(fileOutputStream);
                                        fileOutputStream.close();
                                        ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 57, "FlightRecordWriterImpl.java")).q("Write successful");
                                        ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecorderImpl", "submitMutation", 72, "FlightRecorderImpl.java")).q("Successfully wrote flight record to disk");
                                        return;
                                    } finally {
                                    }
                                } catch (IOException e) {
                                    ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(e)).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", '<', "FlightRecordWriterImpl.java")).q("Failed to write FlightRecord to file");
                                }
                            } else {
                                ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 41, "FlightRecordWriterImpl.java")).q("Failed to create flight records directory");
                            }
                            ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecorderImpl", "submitMutation", 74, "FlightRecorderImpl.java")).q("Failed to write flight record to disk");
                        }
                    }
                    ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 34, "FlightRecordWriterImpl.java")).q("Invalid FlightRecord");
                    ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecorderImpl", "submitMutation", 74, "FlightRecorderImpl.java")).q("Failed to write flight record to disk");
                }
            }
        }, this.e);
    }

    @Override // defpackage.eceu
    public final void b() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            erny.g(((ecez) it.next()).b(), new eroh() { // from class: ecer
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return ecet.this.a((ecep) obj);
                }
            }, this.d);
        }
    }
}

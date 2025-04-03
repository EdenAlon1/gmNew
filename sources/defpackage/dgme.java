package defpackage;

import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgme {
    private ewoj a = null;
    private final File b;
    private final File c;

    public dgme(File file) {
        this.b = file;
        this.c = new File(file, "gmscompliance.pb");
    }

    public final synchronized emxc a() {
        emxc emxcVar;
        DataInputStream dataInputStream;
        emxc emxcVar2;
        if (this.a == null) {
            File file = this.c;
            if (!file.exists()) {
                Log.w("CacheStorage", "cache doesn't exist");
                emxcVar = emux.a;
            } else if (!file.isFile() || file.length() < 4) {
                Log.e("CacheStorage", "cache is corrupted");
                file.delete();
                emxcVar = emux.a;
            } else {
                try {
                    dataInputStream = new DataInputStream(new FileInputStream(file));
                } catch (IOException e) {
                    Log.e("CacheStorage", "error reading cache: ".concat(e.toString()));
                }
                try {
                    int readInt = dataInputStream.readInt();
                    if (readInt != 1) {
                        Log.e("CacheStorage", a.h(readInt, "invalid cache version: "));
                        dataInputStream.close();
                        file.delete();
                        emxcVar = emux.a;
                    } else {
                        int readInt2 = dataInputStream.readInt();
                        if (readInt2 <= 0) {
                            Log.e("CacheStorage", a.h(readInt2, "invalid length: "));
                            emxcVar2 = emux.a;
                        } else {
                            byte[] bArr = new byte[readInt2];
                            dataInputStream.readFully(bArr);
                            dgwv dgwvVar = (dgwv) eyfy.parseFrom(dgwv.a, bArr, eyfc.a());
                            if ((1 & dgwvVar.b) != 0) {
                                ewoj ewojVar = dgwvVar.c;
                                if (ewojVar == null) {
                                    ewojVar = ewoj.a;
                                }
                                emxcVar2 = emxc.j(ewojVar);
                            } else {
                                Log.e("CacheStorage", "message wrapper is empty");
                                emxcVar2 = emux.a;
                            }
                        }
                        dataInputStream.close();
                        emxcVar = emxcVar2;
                    }
                } catch (Throwable th) {
                    try {
                        dataInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            this.a = (ewoj) emxcVar.f();
        }
        return emxc.i(this.a);
    }

    final synchronized void b(ewoj ewojVar) {
        this.a = null;
        if (!this.b.exists() && !this.b.mkdirs()) {
            Log.e("CacheStorage", "failed to create cache dir");
            return;
        }
        if (this.c.exists() && this.c.isDirectory() && !this.c.delete()) {
            Log.e("CacheStorage", "failed to delete cache dir collision");
            return;
        }
        dgwu dgwuVar = (dgwu) dgwv.a.createBuilder();
        dgwuVar.copyOnWrite();
        dgwv dgwvVar = (dgwv) dgwuVar.instance;
        ewojVar.getClass();
        dgwvVar.c = ewojVar;
        dgwvVar.b |= 1;
        byte[] byteArray = ((dgwv) dgwuVar.build()).toByteArray();
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.c));
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(byteArray.length);
                dataOutputStream.write(byteArray);
                dataOutputStream.close();
                this.a = ewojVar;
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            Log.e("CacheStorage", "failed to write cache: ".concat(e.toString()));
        }
    }
}

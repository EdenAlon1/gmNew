package defpackage;

import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioTimestamp;
import android.os.Process;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exkx {
    public final int a;
    public final int b;
    public final int c;
    public AudioRecord e;
    public AudioFormat f;
    private final int i;
    private final int j;
    private final int k;
    private Thread l;
    public long d = Long.MIN_VALUE;
    public boolean g = false;
    public final CopyOnWriteArraySet h = new CopyOnWriteArraySet();

    public exkx(int i, int i2) {
        this.a = i;
        this.i = i2;
        int i3 = i2 == 12 ? 2 : 1;
        int i4 = i3 + i3;
        this.b = i4;
        int minBufferSize = AudioRecord.getMinBufferSize(i, i2, 2);
        this.j = minBufferSize;
        int ceil = (int) Math.ceil(((i4 * i) * 10000.0d) / 1000000.0d);
        this.c = ceil;
        int max = Math.max(ceil, minBufferSize);
        this.k = max + max;
    }

    public final void a(exkn exknVar) {
        this.h.clear();
        this.h.add(exknVar);
    }

    public final void b() {
        if (this.g) {
            return;
        }
        Log.d("MicrophoneHelper", "AudioRecord(" + this.a + ", " + this.k + ")");
        this.f = new AudioFormat.Builder().setEncoding(2).setSampleRate(this.a).setChannelMask(this.i).build();
        AudioRecord build = new AudioRecord.Builder().setAudioSource(1).setAudioFormat(this.f).setBufferSizeInBytes(this.k).build();
        this.e = build;
        if (build.getState() != 1) {
            this.e.release();
            Log.e("MicrophoneHelper", "AudioRecord could not open.");
        } else {
            this.l = new Thread(new Runnable() { // from class: exkw
                @Override // java.lang.Runnable
                public final void run() {
                    int timestamp;
                    long j;
                    Process.setThreadPriority(-16);
                    exkx exkxVar = exkx.this;
                    exkxVar.d = System.nanoTime();
                    int i = 0;
                    while (exkxVar.g && exkxVar.e != null) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(exkxVar.c);
                        int i2 = 0;
                        while (i2 < allocateDirect.capacity()) {
                            try {
                                int read = exkxVar.e.read(allocateDirect, allocateDirect.capacity() - i2, 0);
                                if (read <= 0) {
                                    String str = "ERROR";
                                    if (read == -3) {
                                        str = "ERROR_INVALID_OPERATION";
                                    } else if (read == -2) {
                                        str = "ERROR_BAD_VALUE";
                                    } else if (read == -6) {
                                        str = "ERROR_DEAD_OBJECT";
                                    }
                                    throw new IOException("AudioRecord.read(...) failed due to ".concat(str));
                                }
                                i2 += read;
                                allocateDirect.position(i2);
                            } catch (IOException e) {
                                Log.e("MicrophoneHelper", e.getMessage());
                            }
                        }
                        allocateDirect.position(0);
                        long j2 = i;
                        long j3 = exkxVar.d;
                        exkxVar.e.getClass();
                        AudioTimestamp audioTimestamp = new AudioTimestamp();
                        timestamp = exkxVar.e.getTimestamp(audioTimestamp, 0);
                        if (timestamp != 0) {
                            Log.e("MicrophoneHelper", a.h(timestamp, "audioRecord.getTimestamp failed with status: "));
                            audioTimestamp = null;
                        }
                        if (audioTimestamp != null) {
                            long j4 = audioTimestamp.framePosition;
                            long j5 = audioTimestamp.nanoTime;
                            j = j4;
                            j3 = j5;
                        } else {
                            j = 0;
                        }
                        long j6 = j3 + (((j2 - j) * 1000000000) / exkxVar.a);
                        if (i == 0) {
                            i = 0;
                        }
                        long j7 = j6 / 1000;
                        i += allocateDirect.limit() / exkxVar.b;
                        if (exkxVar.g) {
                            Iterator it = exkxVar.h.iterator();
                            while (it.hasNext()) {
                                ((exkn) it.next()).a(allocateDirect, j7, exkxVar.f);
                            }
                        }
                    }
                }
            }, "microphoneHelperRecordingThread");
        }
        this.e.startRecording();
        if (this.e.getRecordingState() != 3) {
            Log.e("MicrophoneHelper", "AudioRecord couldn't start recording.");
            this.e.release();
        } else {
            this.g = true;
            this.l.start();
            Log.d("MicrophoneHelper", "AudioRecord is recording audio.");
        }
    }

    public final void c() {
        this.e.getClass();
        if (this.g) {
            this.g = false;
            try {
                Thread thread = this.l;
                if (thread != null) {
                    thread.join();
                }
            } catch (InterruptedException e) {
                Log.e("MicrophoneHelper", "Exception: ", e);
            }
            this.e.stop();
            if (this.e.getRecordingState() != 1) {
                Log.e("MicrophoneHelper", "AudioRecord.stop() didn't run properly.");
            }
        }
        AudioRecord audioRecord = this.e;
        audioRecord.getClass();
        if (!this.g) {
            audioRecord.release();
        }
        Log.d("MicrophoneHelper", "AudioRecord stopped recording audio.");
    }
}

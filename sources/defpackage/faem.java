package defpackage;

import android.media.AudioFormat;
import android.util.Log;
import android.util.Size;
import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.GraphTextureFrame;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketGetter;
import com.google.mediapipe.framework.TextureFrame;
import com.google.research.xeno.effect.Callbacks$StatusCallback;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.EventManager;
import com.google.research.xeno.effect.FilterProcessorBase;
import com.google.research.xeno.effect.InputFrameSource;
import com.google.research.xeno.effect.NativeCallbacks$AuxOutputCallback;
import com.google.research.xeno.effect.NativeCallbacks$PacketCallback;
import com.google.research.xeno.effect.UserInteractionManager;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faem extends FilterProcessorBase implements exky, exkn {
    public static final String b = "faem";
    public static final Size c = new Size(-1, -1);

    public faem(fadq fadqVar) {
        super(fadqVar);
        long a = this.g.a();
        faco facoVar = (faco) fadqVar;
        long[] g = ermr.g(facoVar.b);
        long j = facoVar.a;
        String str = faes.a;
        byte[] bArr = (byte[]) Optional.ofNullable(null).map(new Function() { // from class: faer
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((fadv) obj).toByteArray();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(new byte[0]);
        final CopyOnWriteArraySet copyOnWriteArraySet = this.j;
        final CopyOnWriteArraySet copyOnWriteArraySet2 = this.h;
        NativeCallbacks$PacketCallback nativeCallbacks$PacketCallback = new NativeCallbacks$PacketCallback() { // from class: faeq
            @Override // com.google.research.xeno.effect.NativeCallbacks$PacketCallback
            public final void process(Packet packet) {
                String str2 = faes.a;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    fadz fadzVar = (fadz) it.next();
                    packet.a();
                    fadzVar.c();
                }
                CopyOnWriteArraySet copyOnWriteArraySet3 = copyOnWriteArraySet2;
                GraphTextureFrame a2 = PacketGetter.a(packet);
                Iterator it2 = copyOnWriteArraySet3.iterator();
                while (it2.hasNext()) {
                    exky exkyVar = (exky) it2.next();
                    GraphTextureFrame a3 = PacketGetter.a(packet);
                    exkyVar.hI(a3);
                    if (Log.isLoggable(faes.a, 2)) {
                        Log.v(faes.a, String.format("Output tex: %d width: %d height: %d to consumer %h", Integer.valueOf(a3.getTextureName()), Integer.valueOf(a3.a), Integer.valueOf(a3.b), exkyVar));
                    }
                }
                a2.release();
            }
        };
        final CopyOnWriteArraySet copyOnWriteArraySet3 = this.i;
        NativeCallbacks$PacketCallback nativeCallbacks$PacketCallback2 = new NativeCallbacks$PacketCallback() { // from class: faeo
            @Override // com.google.research.xeno.effect.NativeCallbacks$PacketCallback
            public final void process(Packet packet) {
                String str2 = faes.a;
                Iterator it = copyOnWriteArraySet3.iterator();
                while (it.hasNext()) {
                    ((exkn) it.next()).a(ByteBuffer.wrap(PacketGetter.nativeGetAudioData(packet.getNativeHandle())), packet.a(), new AudioFormat.Builder().setEncoding(2).setChannelMask(PacketGetter.nativeGetMatrixRows(packet.getNativeHandle()) == 2 ? 12 : 16).build());
                }
            }
        };
        final CopyOnWriteArraySet copyOnWriteArraySet4 = this.k;
        final fagf fagfVar = Effect.a;
        long nativeNewVideoProcessor = nativeNewVideoProcessor(0, a, 0L, g, j, bArr, nativeCallbacks$PacketCallback, nativeCallbacks$PacketCallback2, new NativeCallbacks$AuxOutputCallback() { // from class: faep
            @Override // com.google.research.xeno.effect.NativeCallbacks$AuxOutputCallback
            public final void onOutput(Packet packet, String str2, long j2) {
                String str3 = faes.a;
                fagf.this.b(j2);
                Iterator it = copyOnWriteArraySet4.iterator();
                while (it.hasNext()) {
                    ((fady) it.next()).a();
                }
            }
        });
        long nativeGetUserInteractionManager = FilterProcessorBase.nativeGetUserInteractionManager(nativeNewVideoProcessor);
        UserInteractionManager userInteractionManager = new UserInteractionManager();
        userInteractionManager.c = this;
        userInteractionManager.b = nativeGetUserInteractionManager;
        FilterProcessorBase.nativeGetEventManager(nativeNewVideoProcessor);
        int i = EventManager.a;
        this.d.writeLock().lock();
        try {
            this.f = nativeNewVideoProcessor;
        } finally {
            this.d.writeLock().unlock();
        }
    }

    @Override // defpackage.exkn
    public final void a(ByteBuffer byteBuffer, final long j, AudioFormat audioFormat) {
        final Packet create;
        if (audioFormat.getChannelCount() == 0) {
            Log.e(b, "Current AudioFormat's channel count is 0");
            return;
        }
        int limit = (byteBuffer.limit() / 2) / audioFormat.getChannelCount();
        AndroidPacketCreator androidPacketCreator = this.e;
        int channelCount = audioFormat.getChannelCount();
        int remaining = byteBuffer.remaining();
        int i = channelCount * limit;
        int i2 = i + i;
        if (i2 != remaining) {
            throw new IllegalArgumentException(a.r(remaining, i2, "Please check the audio data size, has to be num_channels * num_samples * 2 = ", " but was "));
        }
        if (byteBuffer.isDirect()) {
            create = Packet.create(androidPacketCreator.nativeCreateAudioPacketDirect(androidPacketCreator.a.a(), byteBuffer.slice(), channelCount, limit));
        } else {
            if (!byteBuffer.hasArray()) {
                throw new IllegalArgumentException("Data must be either a direct byte buffer or be backed by a byte array.");
            }
            create = Packet.create(androidPacketCreator.nativeCreateAudioPacket(androidPacketCreator.a.a(), byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), channelCount, limit));
        }
        hK(new faec() { // from class: faek
            @Override // defpackage.faec
            public final void a(long j2) {
                String str = faem.b;
                faem.nativeSendVideoProcessorAudioPacket(j2, Packet.this.getNativeHandle(), j, new Callbacks$StatusCallback() { // from class: faei
                    @Override // com.google.research.xeno.effect.NativeCallbacks$StatusCallback
                    public final void onCompletion(boolean z, String str2) {
                        String str3 = faem.b;
                        if (z) {
                            return;
                        }
                        Log.e(faem.b, "Error sending video processor audio packet: ".concat(String.valueOf(str2)));
                    }
                });
            }
        });
        create.release();
    }

    public final void c(final InputFrameSource inputFrameSource, final Size size, final AudioFormat audioFormat, final Callbacks$StatusCallback callbacks$StatusCallback) {
        hK(new faec() { // from class: faej
            @Override // defpackage.faec
            public final void a(long j) {
                String str = faem.b;
                Size size2 = size;
                long width = size2.getWidth();
                long height = size2.getHeight();
                AudioFormat audioFormat2 = audioFormat;
                int sampleRate = audioFormat2 == null ? 0 : audioFormat2.getSampleRate();
                int channelCount = audioFormat2 != null ? audioFormat2.getChannelCount() : 0;
                faem.nativeStartVideoProcessing(j, InputFrameSource.this.e, width, height, sampleRate, channelCount, callbacks$StatusCallback);
            }
        });
    }

    public final void d() {
        e(null);
    }

    public final void e(final Callbacks$StatusCallback callbacks$StatusCallback) {
        hK(new faec() { // from class: faeg
            @Override // defpackage.faec
            public final void a(long j) {
                faem.nativeStopVideoProcessing(j, Callbacks$StatusCallback.this);
            }
        });
    }

    @Override // defpackage.exky
    public final void hI(TextureFrame textureFrame) {
        final long timestamp = textureFrame.getTimestamp();
        AndroidPacketCreator androidPacketCreator = this.e;
        final Packet create = Packet.create(androidPacketCreator.nativeCreateGpuBuffer(androidPacketCreator.a.a(), textureFrame.getTextureName(), textureFrame.getWidth(), textureFrame.getHeight(), textureFrame));
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((fadz) it.next()).b();
        }
        hK(new faec() { // from class: fael
            @Override // defpackage.faec
            public final void a(long j) {
                long nativeHandle = create.getNativeHandle();
                final faem faemVar = faem.this;
                faem.nativeSendVideoProcessorFramePacket(j, nativeHandle, timestamp, new Callbacks$StatusCallback() { // from class: faeh
                    @Override // com.google.research.xeno.effect.NativeCallbacks$StatusCallback
                    public final void onCompletion(boolean z, String str) {
                        if (z) {
                            return;
                        }
                        Iterator it2 = faem.this.j.iterator();
                        while (it2.hasNext()) {
                            ((fadz) it2.next()).a();
                        }
                        Log.e(faem.b, "Error sending video processor frame packet: ".concat(String.valueOf(str)));
                    }
                });
            }
        });
        create.release();
    }
}

package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efda extends efde implements efch, efcg, efcx {
    private final FileOutputStream a;
    private final File b;

    public efda(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.efcg
    public final FileChannel a() {
        return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.a.getChannel());
    }

    @Override // defpackage.efcx
    public final void b() {
        this.a.getFD().sync();
    }

    @Override // defpackage.efch
    public final File c() {
        return this.b;
    }
}
